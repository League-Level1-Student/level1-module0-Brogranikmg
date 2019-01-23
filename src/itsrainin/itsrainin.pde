int dropY = 0;
int randX = (int) random(width); 
int score;

void setup() {
  size(500, 500);
}

void draw() {
  background(31, 23, 12);
  fill(179, 179, 25);
  stroke(91, 123, 164);
  ellipse(randX, dropY, 21, 32);
  if (mousePressed) {
    fill(89, 1, 3);
    stroke(0, 13, 10);
    dropY = (int) random(height - 10);
  } else {
    fill(82, 82, 82);
    stroke(179, 180, 1);
  }
  rect(mouseX, 441, 51, 76);
  dropY += log(score + 5) / log(1.5);
  if (dropY > 425 && randX > mouseX - 20 && randX < mouseX + 71) {
    checkCatch(randX);
    randX = (int) random(width);
    dropY = 0;
  }
  if (dropY > 500) {
    checkCatch(randX);
    randX = (int) random(width);
    dropY = 0;
  }
  fill(189, 255, 202);
  textSize(16);
  text("Score: " + score, 20, 20);
}

void checkCatch(int x) {
  if (x > mouseX - 20 && x < mouseX + 71 && !mousePressed)
    score++;
  else if (score > 0)
    score--;
    println("Your score is now: " + score);
 }