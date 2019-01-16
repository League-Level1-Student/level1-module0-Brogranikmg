int dropY = 0;
int dropX = 0;

void setup() {
  size(500, 500);
  background(31, 23, 12);
}

void draw() {
  fill(179, 179, 25);
  stroke(91, 123, 164);
  ellipse(278 + dropX, 152 + dropY, 71, 82);
  dropY++;
  dropX += sin(dropY / 5) * 3;
}