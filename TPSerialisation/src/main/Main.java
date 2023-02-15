package main;

import model.User;
import serializers.Serializer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Serializer serializer = new Serializer();
		User sidiki = new User(55, "absicamara", "rootStaysRoot");
		
		
//		Serialization
		
		serializer.serialize(sidiki, "user.ser");
		
		
//		Deserialization
		serializer.deSerialize("user.ser");


		
	}

}
