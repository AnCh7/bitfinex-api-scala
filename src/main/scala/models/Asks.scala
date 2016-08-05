package models

/**
  * For example:
  * "asks":[{
  * "rate":"8.3695",
  * "amount":"407.5",
  * "period":2,
  * "timestamp":"1444260343.0",
  * "frr":"No"
  * }]
  *
  * @param rate      [rate in % per 365 days]
  * @param amount    [decimal]
  * @param period    [days] maximum period for the funding contract.
  * @param timestamp [time]
  * @param frr       [yes/no] “Yes” if the offer is at Flash Return Rate, “No” if the offer is at fixed rate.
  */
case class Asks(rate: Float, amount: Float, period: Int, timestamp: Double, frr: Frr) extends FundingContract



