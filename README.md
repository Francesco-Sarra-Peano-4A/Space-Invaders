# Space-Invaders
Questo programma è formato da un main chiamato SpaceInvaders,che estende la classe Jframe. 
La classe JFrame permette di dare funzionalità nell'ambinete grafico, come ad esempio la X , per chiudere in questo caso il gioco.
Succesivamente ho esteso la classe Space con Canvas , esso è un "rettangolo" dove permette di disegnare sopra, ad esempio in questo programma rappresenta lo spazio , dove abbiamo creato la classe apposta, grazie a extends verrà aggiunto alla finestra di gioco.

STEP 1:
Nello step 1 si è creato la classe Intro , che estende la classe Space.
In questa classe si è fatto un Override , che permette di aggiungere elementi grafici, come setColor , setFont e drawString che permette di posizinare la scritta nelle cordinate date.Infine si è aggiunto nella classe SpaceInvaders , la creazione della classe Intro , aggiunge l'intro e si rende visibile grazie al metodo setVisible, infine si avvia l'introduzione.
