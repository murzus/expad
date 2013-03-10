package expad

class User {
 
  
  String login
  String password
  Date dateCreated
  Profile profile
  static hasMany = [smses:SMS,summonses:Summons] 
	
	static constraints = {
	  login(size:3..20, unique:true)
      password(size:3..20, password:true)
	  dateCreated()
	  profile(nullable: true)	  
    }
	static mapping = {
	profile lazy:false
	}
}
