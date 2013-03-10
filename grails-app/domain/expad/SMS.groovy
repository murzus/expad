package expad

class SMS {
 static belongsTo = [author:User]
     String outId 
     String phone
     String text
     Date send	
     Date recieve
     String status
	 
  static constraints = {
      phone(minSize:10,maxSize:12,matches:'[0-9]+',)
      text(maxSize:670,blank:false)
      send()
      recieve()
      status()
   }
    static mapping = {
      sort send:"desc"
    }
}
