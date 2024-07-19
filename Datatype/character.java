class Character{
	public static void main(String[] args){
		char vowel='a';
		char character1='b';
		char letter1='c';
		char consonant='d';
		char character2='e';
		char letter2='p';
		char character3='g';
		char alphabet='h';
		char upperLetter1='I';
		char gender='F';
		char character4='k';
		char lowerletter1='m';
		char bloodGroup1='O';
		char character5='l';
		char upperLetter='Z';
		char bloodGroup2='B';
		char character6='t';
		char lowerletter='w';
		char bloodGroup3='A';
		char gender1='M';
		 
		 char character[]={vowel,character1,letter1,consonant,character2, letter2,character3,alphabet,upperLetter1,gender,character4,lowerletter1, bloodGroup1,character5,
		 upperLetter,bloodGroup2,character6, lowerletter, bloodGroup3,gender1};
		 
		 int no=character.length;
		 System.out.println("total no of character is:"+no);
		 for(int i=0;i<character.length;i++)
		{
			System.out.println(character[i]);
		}
		
		
	}
}