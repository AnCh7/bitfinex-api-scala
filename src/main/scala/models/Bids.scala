package models

/**
  * For example:
  * "bids":[{
  * "rate":"9.1287",
  * "amount":"5000.0",
  * "period":30,
  * "timestamp":"1444257541.0",
  * "frr":"No"
  * }]
  *
  * @param rate      [rate in % per 365 days]
  * @param amount    [decimal]
  * @param period    [days] minimum period for the margin funding contract.
  * @param timestamp [time]
  * @param frr       [yes/no] “Yes” if the offer is at Flash Return Rate, “No” if the offer is at fixed rate.
  */
case class Bids(rate: Float, amount: Float, period: Int, timestamp: Double, frr: Frr) extends FundingContract