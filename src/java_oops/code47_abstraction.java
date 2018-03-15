package java_oops;
abstract class Player{
	
	abstract void onPlay();
	abstract void onPause();
	abstract void onStop();
}

class VLCPlayer extends Player{
	
	void onPlay() {
		System.out.println("Start the playback");
	}
	
	void onPause() {
		System.out.println("Pause the playback");
	}
	
	void onStop() {
		System.out.println("Stop the playback");
	}
}

class CodecPlayer extends Player{
	
	void onPlay() {
		System.out.println("Start the playback on HEIC Codec");
	}
	
	void onPause() {
		System.out.println("Pause the playback on HEIC Codec");
	}
	
	void onStop(){
		System.out.println("Stop the playback on MP4K Codec");
	}
}

public class code47_abstraction {
	
	public static void main(String[] args) {
		
		VLCPlayer vlc = new VLCPlayer();
		vlc.onPlay();
		vlc.onPause();
		vlc.onStop();
		
		CodecPlayer codec = new CodecPlayer();
		codec.onPlay();
		codec.onPause();
		codec.onStop();
		
	}

}
