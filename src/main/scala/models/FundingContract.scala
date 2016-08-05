package models

trait FundingContract {
  def rate: Float
  def amount: Float
  def period: Int
  def timestamp: Double
  def frr: Frr
}

