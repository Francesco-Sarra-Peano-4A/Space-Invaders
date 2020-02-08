# Space-Invaders
Questo programma è formato da un main chiamato SpaceInvaders,che estende la classe Jframe. 
La classe JFrame permette di dare funzionalità nell'ambinete grafico, come ad esempio la X , per chiudere in questo caso il gioco.
Succesivamente ho esteso la classe Space con Canvas , esso è un "rettangolo" dove permette di disegnare sopra, ad esempio in questo programma rappresenta lo spazio , dove abbiamo creato la classe apposta, grazie a extends verrà aggiunto alla finestra di gioco.

STEP 1:
Nello step 1 si è creato la classe Intro , che estende la classe Space.
In questa classe si è fatto un Override , che permette di aggiungere elementi grafici, come setColor , setFont e drawString che permette di posizinare la scritta nelle cordinate date.Infine si è aggiunto nella classe SpaceInvaders , la creazione della classe Intro , aggiunge l'intro e si rende visibile grazie al metodo setVisible, infine si avvia l'introduzione.

STEP 2:
Nello step 2 si è aggiunto un parametro "i" che ho aggiunto alla posizione e al carattere , questo per aggiungere un'animazione dove la scritta che appare va verso l'interno.Succesivamente si è creato un metodo Run() nella classe Intro per richiamare il metodo Repaint(),esso esegue il metodo Update() , dove questo metodo serve solo per chiamare paint dopo aver cancellato l'immagine prima, infine  Repaint() viene ereditato dalla classe Canvas in un ciclo for , dove per ogni ciclo il parametro "i" incrementa.

STEP 3:
Nello step 3 si è cercato di togliere lo sfarfallio , dovuto al fatto che l'immagine che appare a schermo e la formazione di immagine non sono sincronizzate, quindi per far ciò si creano due Canvas , il quale con 1 viene generato l'immagine e succesivamente l'altro crea una altra immagine e la stostituisce alla prima ,questo per togliere lo sfarfallio; tutto questo attraverso lo strumento BufferStrategy , ereditato dalla classe Canvas. Questo strumento verrà avviato nel metodo run(), dove avrà due buffer .
