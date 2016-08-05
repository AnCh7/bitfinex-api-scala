package requests

/**
  * @param limit_bids Not required. Default value is 50. Limit the number of funding bids returned.
  *                   May be 0 in which case the array of bids is empty.
  * @param limit_asks Not required. Default value is 50. Limit the number of funding offers returned.
  *                   May be 0 in which case the array of asks is empty.
  */
case class FundingbookRequest(limit_bids: Int = 50, limit_asks: Int = 50)
