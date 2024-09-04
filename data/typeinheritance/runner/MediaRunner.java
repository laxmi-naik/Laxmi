package com.xworks.data.typeinheritance.runner;

import com.xworks.data.typeinheritance.Audio;
import com.xworks.data.typeinheritance.StreamingVideo;


public class MediaRunner {

	public static void main(String[] args) {
		StreamingVideo streamingVideo =new StreamingVideo();
		Audio audio = new Audio();
		streamingVideo. display();
		audio.play();
		streamingVideo.show();
		audio.print();
	}

}
