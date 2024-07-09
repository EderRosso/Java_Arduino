#define led 13

void LigaLed();
void DesligaLed();
void PiscaLed();

void setup() {
  Serial.begin(9600);
  while(!Serial);
  delay(1000);

  Serial.println("Conectado!!!");
  pinMode(led, OUTPUT);

}

char c;

void loop() {
  if(Serial.available() > 0){
    c = Serial.read();
    //LigaLed(c);

    switch(c){
      case 'l': LigaLed(c);
                break; 
      case 'd': DesligaLed(c);
                break;
      case 'p': PiscaLed(c,c);
                break;

    }  
  }

}

void LigaLed(char c){
    if(c == 'l'){
      digitalWrite(led, HIGH);
    }
}

void DesligaLed(char c){
  if(c == 'd'){
      digitalWrite(led, LOW);
    }
}

void PiscaLed(char c, int t){
  while(c == 'p'){
    if(Serial.available() > 0) 
    c = Serial.read();
    digitalWrite(led, HIGH);
    delay(t);
    digitalWrite(led, LOW);
    delay(t);    
  }
  if(c == 'd'){
    digitalWrite(led, LOW);
  }
  
}
