package expad

class Profile {
    static belongsTo = User
	
	 byte[]  photo
	
	 String name
	 String bio
	 String position
	 String room
	 String phone
	 String email
	 String link
	
    static constraints = {
	 name(nullable:true)
	 bio (maxSize:1000, nullable:true)
	 position (size:1..50, nullable:true)
	 room (matches:'[0-9]{3}[A-Za-z]', nullable:true)
	 phone (matches:'[0-9]{11}', nullable:true)
	 email (email:true, nullable:true)
	 link (url:true,  nullable:true)
    }
}
