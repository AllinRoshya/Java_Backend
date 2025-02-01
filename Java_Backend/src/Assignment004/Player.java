package Assignment004;

 class Player {
String name;
Player(String name){
	this.name=name;
}
@Override
public String toString() {
	return "Player name: "+name;
}
}
