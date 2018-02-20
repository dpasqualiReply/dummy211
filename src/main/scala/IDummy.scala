 import com.typesafe.config.ConfigFactory
 import org.apache.spark.rdd.RDD
 import org.apache.spark.sql.SparkSession

 import sys.process._

object IDummy {

  def main(args: Array[String]): Unit = {

    val conf = ConfigFactory.load()
    val valore = conf.getInt("app.variabile")

    val spark = SparkSession.builder().master("local[*]").appName("dummy").getOrCreate()
    val arr = spark.sparkContext.parallelize((1 to valore*10).toSeq)

    val aaa = arr.map(el => (el/0.000012)*(el/0.000012))

    for(i <- 1 to valore*10){
      inefFunc(i, aaa)
    }

  }

  def inefFunc(v : Double, a: RDD[Double]) : Unit = {

    a.collect().foreach(e => println(e*v))

  }
}
