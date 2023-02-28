# Mini Checkpoint 

Tout développeur un jour se dit : *et si je programmais un jeu ?*

➡️ Et bien ce jour est arrivé 🥳 Nous avons besoin de toi pour programmer l'inventaire d'un jeu de rôle.

Dans un jeu de rôle, l'inventaire permet d'équiper des objets (ici, des armures, des bottes et des anneaux). Ces objets possèdent généralement des bonus (par exemple un anneau pourrait posséder un bonus d'intelligence, des bottes pourraient posséder un bonus d'agilité, etc...). 
Une fois les objets équipés, leurs bonus (exprimés par une valeur numérique) se cumulent et donnent pour chaque caractéristique un bonus total. 


Tu trouveras le travail déjà entamé dans le package `com.wcs.java.checkpoint.inventory`. Tu dois le terminer !

- Commence par lire, compiler et executer la classe `Main` pour comprendre ce qu'elle fait.
- Tu as sans doute remarqué que notre héros est à ce stade peu équipé. Il serait bon de lui donner une armure et des anneaux.
Crée pour cela les classes `Ring`  et `Armor`. Elles doivent toutes les deux implémenter `Item`.
- Puisque tu implémentes `Item`, tu dois respecter un contrat (défini dans `Item`). Implémente les méthodes correspondantes.

> NOTE: la méthode `getType()` te surprendra si tu n'es pas familier avec les `enum` en Java. N'hésite pas à t'inspirer de `Boots` au besoin.

- Une fois tes classes crées, il faudra les instancier pour les ajouter au jeu puis à ton héros. La classe `ItemLoader` 
devrait te permettre de faire cela. 
- Crée plusieurs bottes, anneaux, et armures, de manière à ce que lorsque tu lances le programme, ton héros soit complètement équipé.
- Cette étape terminée, il serait souhaitable d'afficher les bonus totaux appliqués à ton héros. Pour cela, complète la 
méthode `displayOverallBonus()` dans `Inventory`. Elle doit afficher les bonus totaux d'intelligence, force, agilité et résistance.
- Essaye d'envisager tous les cas de figures 🐙

Bon, et bien ca devient pas mal ! Mais ce n'est pas (encore) terminé. En fin développeur Java, tu as sans doute remarqué 
qu'il y a beaucoup de code redondant entre les classes `Boots`, `Ring` et `Armor`. ➡️ Crée une classe abstraite `AbstractItem` qui te permettra de factoriser ce code redondant. 

> NOTE : Tu ne dois pas toucher à l'interface `Item`. Les classes `Boots`, `Ring` et `Armor` doivent continuer d'implémenter `Item`.