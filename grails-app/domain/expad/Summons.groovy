package expad

class Summons {
     
	 static belongsTo = [author:User]
   
     //String outId
     String [] emails
	 String text
	 byte[][] ataches
     
     Date send	
     Date recieve
     String status
	 byte[] report
	 
  static constraints = {
      emails(email:true,blank:false)
      text(maxSize:1000)
	  ataches(nullable:true)
      send()
      recieve()
      status()
	  report(nullabe:true)
   }
    static mapping = {
      sort "send":"desc"
    }
}
