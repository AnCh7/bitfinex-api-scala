package model

/*
{
	"mid": "605.935",
	"bid": "605.93",
	"ask": "605.94",
	"last_price": "605.94",
	"low": "595.0",
	"high": "627.35",
	"volume": "40155.68251591",
	"timestamp": "1470125018.379374482"
}
*/

case class Ticker(mid: String, bid: String, ask: String, last_price: String, low: String,
                  high: String, volume: String, timestamp: String)