package responses

/**
  * Example:
  * [{
  * "period":1,
  * "volume":"7967.96766158"
  * },
  * {
  * "period":30,
  * "volume":"275148.09653645"
  * }]
  *
  * @param period [integer] - period covered in days
  * @param volume [price]- volume
  */
case class StatResponse(period: Int, volume: Float)