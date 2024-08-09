class KeybunchRunner{
	public static void main(String[] args){
		Key key=new Key(5,"schlage");
		Keybunch keybunch=new Keybunch("steel",key);
		keybunch.details();
		System.out.println("++++++++++");
		Key key1=new Key(6.5,"yale");
		Keybunch keybunch1=new Keybunch("brass",key1);
		keybunch1.details();
	}
}