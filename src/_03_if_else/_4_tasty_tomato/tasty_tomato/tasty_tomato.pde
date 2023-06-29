void setup() {
 
    size(500, 500);
  
}
 boolean hasclicked = false;
  int xpos;
  int ypos;
void draw() {

 
    background(255, 255, 255);
    noStroke();
     fill (255,0,0);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill (0,255,0);
    rect(176, 103, 12, 32);
    if (mousePressed) {
     xpos = mouseX;
     ypos = mouseY;
     hasclicked = true;
    }
    if (hasclicked = true){
     fill(255,255,255);
    ellipse(xpos,ypos,40,40);
    
    
    }
}
