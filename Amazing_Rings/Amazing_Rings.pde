 float y=400;
 float a=200;
float b=400;
 float c=600;
void setup(){
  size(800,800);
  strokeWeight(5);
}

void draw(){
  background(255,255,255);
  noFill();
  y=400;
 for(int i=0; i<20; i++){
     ellipse(a, b, y, y);
     y=y-20;
 }
 y=400;
 for(int e=0; e<20; e++){
     ellipse(c, b, y, y);
     y=y-20;
}
if(a>=600 || c<=200){
  a=200;
  c=600;
}
a=a+.5;
c=c-.5;

}