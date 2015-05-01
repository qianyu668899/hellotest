package com.yu

/**
 * Created by Yu on 15-04-24.
 */

import com.mongodb.casbah.Imports._

package object start {
  def main(args: Array[String]) {
    val mongoClient = MongoClient("localhost", 27017)
    insert(mongoClient, "test")
    //println(getCount(mongoClient, "test"))
    getCursor(mongoClient, "test")
    update(mongoClient, "test")
    remove(mongoClient, "test")
    drop(mongoClient, "test")
  }

  def insert(mongoClient: MongoClient, dbName:String): Unit = {
    val db = mongoClient(dbName)
    db.collectionNames
    val coll = db(dbName)
    val a = MongoDBObject("hello" -> "world")
    val b = MongoDBObject("language" -> "scala")
    coll.insert( a )
    coll.insert( b )
  }

  def getCount(mongoClient: MongoClient, dbName:String): Int = {
    return mongoClient(dbName)(dbName).count()
  }

  def getCursor(mongoClient: MongoClient, dbName:String): MongoCursor = {
    val allDocs =  mongoClient(dbName)(dbName).find()
    println( allDocs )
    for(doc <- allDocs) println( doc )
    return allDocs
  }

  def update(mongoClient: MongoClient, dbName:String): Unit = {
    val coll = mongoClient(dbName)(dbName)
    val query = MongoDBObject("hello" -> "world")
    val update = MongoDBObject("platform" -> "iOS")
    val result = coll.update( query, update )

    println("Number updated: " + result.getN)
    for (c <- coll.find) println(c)
  }

  def remove(mongoClient: MongoClient, dbName:String): Unit = {
    val coll = mongoClient(dbName)(dbName)
    val query = MongoDBObject("language" -> "scala")
    val result = coll.remove( query )

    println("Number removed: " + result.getN)
    for (c <- coll.find) println(c)
  }

  def drop(mongoClient: MongoClient, dbName:String): Unit = {
    mongoClient(dbName)(dbName).drop()
  }
}
