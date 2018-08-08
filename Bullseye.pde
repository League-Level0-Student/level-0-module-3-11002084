void setup(){
  size(1000,1000);
  noFill();
  int x=640;
  int y=640;
  for(int i=0; i<15; i++){
    if(i%2==0){
      fill(255,0,0);
    }
    else{
      fill(255);
    }
    ellipse(400,400,x,y);
    x-=40;
    y-=40;
    }
}
void draw(){
  
}