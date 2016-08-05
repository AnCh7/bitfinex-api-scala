package responses

/**
  * Example:
  * {
  * "mid": "605.935",
  * "bid": "605.93",
  * "ask": "605.94",
  * "last_price": "605.94",
  * "low": "595.0",
  * "high": "627.35",
  * "volume": "40155.68251591",
  * "timestamp": "1470125018.379374482"
  * }
  *
  * @param mid        [price] - (bid + ask) / 2
  * @param bid        [price] - Innermost bid.
  * @param ask        [price] - Innermost ask.
  * @param last_price [price] - The price at which the last order executed.
  * @param low        [price] - Lowest trade price of the last 24 hours.
  * @param high       [price] - Highest trade price of the last 24 hours.
  * @param volume     [price] - Trading volume of the last 24 hours
  * @param timestamp  [time] - The timestamp at which this information was valid.
  */
case class TickerResponse(mid: Float, bid: Float, ask: Float, last_price: Float,
                          low: Float, high: Float, volume: Float, timestamp: String)

