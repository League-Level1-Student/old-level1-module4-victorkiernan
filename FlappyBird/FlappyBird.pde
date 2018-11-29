float pipex=600;
float grav=0.2;
float y=100;
float vel=2;
void setup() {
size(600,600);
}

void draw() {
background(255,140,0);
ellipse(300,y,50,50);
y+=vel;
vel+=grav;
rect(pipex,0,50,150);
pipex+=-5;
teleportPipes();
}
void mousePressed(){
vel=-3;
}
void teleportPipes(){
if(pipex<=-50){
pipex=600;}
}