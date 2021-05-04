package //File path

import scala.math.{min, max}

trait HasColor {
  var color: (Int, Int, Int)
  var (red, green, blue) = color

  def sync(x: Int): Unit = x match {
    case 0 => red = color._1; green = color._2; blue = color._3
    case 1 => color = (red, green, blue)
  }
  def setColor(r:Int,g:Int,b:Int): Unit = {
    color = (r,g,b)
    sync(0)
  }
  def increaseRedBy(redPercentage: Float): Unit = { red = min((red + red * redPercentage).toInt, 255); sync(1) }
  def increaseGreenBy(greenPercentage: Float): Unit = { green = min((green + green * greenPercentage).toInt, 255); sync(1) }
  def increaseBlueBy(bluePercentage: Float): Unit = { blue = min((blue + blue * bluePercentage).toInt,255); sync(1) }
  def decreaseRedBy(redPercentage: Float): Unit = { red = max((red - red * redPercentage).toInt,0); sync(1) }
  def decreaseGreenBy(greenPercentage: Float): Unit = { green = max((green - green * greenPercentage).toInt,0); sync(1) }
  def decreaseBlueBy(bluePercentage: Float): Unit = { blue = max((blue - blue * bluePercentage).toInt,0); sync(1) }
}