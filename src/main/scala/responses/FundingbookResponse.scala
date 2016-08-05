package responses

import models.{Asks, Bids}

/**
  * For example:
  * {
  * "bids":[{
  * "rate":"9.1287",
  * "amount":"5000.0",
  * "period":30,
  * "timestamp":"1444257541.0",
  * "frr":"No"
  * }],
  * "asks":[{
  * "rate":"8.3695",
  * "amount":"407.5",
  * "period":2,
  * "timestamp":"1444260343.0",
  * "frr":"No"
  * }]
  * }
  *
  * @param bids Array of funding bids.
  * @param asks Array of funding offers.
  */
case class FundingbookResponse(bids: Bids, asks: Asks)