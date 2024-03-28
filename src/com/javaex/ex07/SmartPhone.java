package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
    	
    	//str -> 음악 : MusicPhone에서 처리
    	// 기본 처리 : phone
    	// 앱 : 본 클래스에서 앱실행 코드 처리
        if(str.equals("앱")){
        	runApp();
        }else {
        	//나머지는 부모 메서드에 위임
        	super.execute(str);
        }
        
    }
 
    //메소드작성
    protected void openApp() {
    	System.out.println("앱실행");
    }
    
    //메소드작성
   @Override
    	
    
    
}
