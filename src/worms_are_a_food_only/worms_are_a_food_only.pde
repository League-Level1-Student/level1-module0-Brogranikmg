import ddf.minim.*;
PImage recordPicture;
int speed = 0;
int velocity = 0;
Minim minim;
AudioPlayer song;

void setup() {
  size(600, 600);
  recordPicture = loadImage("record.png");
  recordPicture.resize(600, 600);
  minim = new Minim(this);
  song = minim.loadFile("jazz.mp3", 512);
}

void draw() {
  rotateImage(recordPicture, speed);
  image(recordPicture, 0, 0);
  if (mousePressed == true) {
    velocity = velocity + 5;
    song.play();
  } else {
    song.pause();
  }
  speed += velocity;
  velocity *= 0.9;
}

void rotateImage(PImage image, int amountToRotate) {
     translate(width/2, height/2);
     rotate(amountToRotate*TWO_PI/360);
     translate(-image.width/2, -image.height/2);
}