# BlackJack

Project context
Vous êtes développeur back-end JAVA et on vous demande de faire des ateliers de jeux aux profils des apprenants de l'ENAA. L’équipe pédagogique décide de créer un jeu de cartes qui aident les apprenants à s’amuser.

​

Dans un jeu de cartes, une carte est caractérisée par sa couleur (1 pour carreau, 2 pour cœur, 3 pour pique, et 4 pour trèfle) et par sa valeur:

-Les cartes numérotées (2 à 10) ont la même valeur que leur numéro. -Les cartes figures (valet, dame, roi) valent toutes 10 points.

-Les As équivalent à 1 ou à 11 selon le jeu du joueur Si votre main ne dépasse pas 21, l’as compte 11. Si au contraire elle le dépasse, l’As compte pour 1; la valeur de l’As étant toujours calculée à votre avantage.

-Un paquet de carte est constitué de 52 cartes mélangées.

​

Fonctionnalité de Jeu du Blackjack

​

** En tant que joueur, je peux:**

Placer une mise avant le début de la partie.
Recevoir deux cartes initiales pour commencer la partie.
Voir mes cartes et leur valeur totale à tout moment.
Choisir de tirer une nouvelle carte (hit) pour améliorer ma main.
Rester avec ma main actuelle (stand) si je suis satisfait de mes cartes.
Être informé si j'ai gagné, perdu ou si la partie est nulle.
Démarrer une nouvelle partie une fois que la précédente est terminée.
Consulter mes gains ou mes pertes que seront mis à jour après chaque partie.
** En tant que croupier, je peux:**

Distribuer une carte visible et une carte cachée pour commencer la partie.
révéler ma carte cachée après que le joueur a terminer de jouer.
Voir mes cartes et leur valeur totale à tout moment.
Tirer des cartes supplémentaires jusqu'à atteindre un total de 17 ou plus.
Comparer ma main avec celle du joueur pour déterminer le résultat de la partie.
​

Le jeu doit suivre les règles standard du Blackjack pour décider le résultat d'une partie de jeu:

Si la main du joueur dépasse 21 points, il perd automatiquement (buste).

Si la main du joueur est inférieure à celle du croupier et que le croupier ne dépasse pas 21, le joueur perd.

Si la main du joueur est supérieure à celle du croupier sans dépasser 21, le joueur gagne.

Si les deux mains ont la même valeur, c'est un match nul (push), et le joueur récupère sa mise.
