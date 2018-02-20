import java.io.File

import com.typesafe.config.ConfigFactory
import org.apache.spark.sql.SparkSession

import sys.process._

object Dummy {

  def main(args: Array[String]): Unit = {

    val conf = ConfigFactory.load()
    val valore = conf.getInt("app.variabile")

    val spark = SparkSession.builder().master("local[*]").appName("dummy").getOrCreate()
    val arr = spark.sparkContext.parallelize(Array(valore, valore))

    arr.map(a => a*200).foreach(println)

  }
}
