import Bitfinex.{get, path}
import model.Ticker
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.{Call, Retrofit}

// https://github.com/tonyskn/coursera-reactive/blob/master/w4-suggestions/src/main/scala/suggestions/search/Search.scala
// https://github.com/eli-jordan/retrofit-rxscala-adapter/blob/master/src/main/scala/sample/Sample.scala

trait BitfinexApi {

  @get("symbols")
  def symbols(): Call[Array[String]]

  @get("pubticker/{symbol}")
  def ticker(@path("symbol") symbol: String): Call[Ticker]
}

object Bitfinex {

  type get = retrofit2.http.GET
  type path = retrofit2.http.Path
  val API_URL = "https://api.bitfinex.com/v1/"

  def getTicker(symbol: String): String = {

    val retrofit = new Retrofit.Builder()
      .baseUrl(API_URL)
      .addConverterFactory(GsonConverterFactory.create())
      .build()

    val bitfinex = retrofit.create(classOf[BitfinexApi])
    val response = bitfinex.ticker(symbol).execute()
    " "
  }
}
