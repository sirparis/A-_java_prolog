# A*_java_prolog
Υλοποίηση αλγορίθμου αναζήτησης Α* σε java &amp; prolog

#**Περιγραφή του  αλγορίθμου Α-star** 
O A-star είναι από τους πιο γνωστούς και ευρέως χρησιμοποιημένους αλγόριθμους της Τεχνητής Νοημοσύνης που χρησιμοποιείται για την αναζήτηση μονοπατιού και για την διάσχιση γράφου. Ανήκει στην κατηγορία των αλγορίθμων πληροφορημένης ή ευρετικής αναζήτησης. Οι αλγόριθμοι αυτοί χρησιμοποιούν ευρετική συνάρτηση με τη βοήθεια της οποίας αξιολογούν τις επόμενες πιθανές καταστάσεις και επιλέγουν την καλύτερη από αυτές.
Σκοπός του αλγορίθμου είναι η εύρεση της βέλτιστης λύσης δηλαδή το συντομότερο μονοπάτι με το λιγότερο κόστος μεταξύ 2 σημείων που ονομάζονται κόμβοι. Ο αλγόριθμος βρίσκει ευρεία χρήση λόγω της ακρίβειας και των επιδόσεων του. Είναι αποτέλεσμα συνδυασμού της άπληστης αναζήτησης με την αναζήτηση με βάση το κόστος. Πραγματοποιεί μια ταξινόμηση των καταστάσεων(κόμβων) με βάση την συνάρτηση f(k)= g(k) + h(k). H συνάρτηση g αντιπροσωπεύει το κόστος για να φθάσουμε από το αρχική κατάσταση στην τρέχουσα κατάσταση, ενώ η συνάρτηση h είναι μια ευρετική 20 συνάρτηση που εκτιμά την απόσταση από την παρούσα κατάσταση στην κατάσταση στόχο.
Τα χαρακτηριστικά του αλγορίθμου :
• ΕΙΝΑΙ ΠΛΗΡΗΣ : μπορεί να επιστρέψει λύση (μονοπάτι) εφόσον αυτή υπάρχει
• ΕΙΝΑΙ ΒΕΛΤΙΣΤΟΣ: Αν η ευρετική συνάρτηση είναι παραδεκτή
Η αναζήτηση Α* είναι πλήρης, βέλτιστη και βέλτιστα αποδοτική μεταξύ όλων των αλγορίθμων αυτού του είδους. Το πρόβλημα είναι ότι στα περισσότερα προβλήματα, ο αριθμός των κόμβων μέσα στο χώρο αναζήτησης εξακολουθεί να αυξάνεται εκθετικά με το μήκος της λύσης. Έχει αποδειχθεί ότι η αύξηση θα είναι εκθετική εκτός αν το σφάλμα της ευρεστικής συνάρτησης δεν αυξάνεται γρηγορότερα από το λογάριθμο του πραγματικού κόστους διαδρομής. Σε μαθηματική σημειογραφία, η συνθήκη για αύξηση χαμηλότερη της εκθετικής είναι |h(n)-h*(n)| ≤ Ο(logh*(x)) 21 Όπου h* είναι το πραγματικό κόστος της μετάβασης από τον κόμβο n στον στόχο. Για όλους σχεδόν τους ευρεστικούς μηχανισμούς που χρησιμοποιούνται στην πράξη, το σφάλμα είναι τουλάχιστον ανάλογο με το κόστος διαδρομής και η εκθετική αύξηση που προκύπτει τελικά ξεπερνά τις δυνατότητες οποιουδήποτε υπολογιστή. Ο χρόνος υπολογισμού δεν είναι όμως το κύριο μειονέκτημα της αναζήτησης Α-star. Επειδή διατηρεί στην μνήμη όλους τους κόμβους που παράγονται, ο αλγόριθμος Α* εξαντλεί πολύ συχνά τον χώρο που έχουμε στην διάθεση μας. Για αυτόν τον λόγο ο Α* δεν είναι χρήσιμος για πολλά προβλήματα μεγάλης κλίμακας. Για τον λόγω αυτό έχουν επινοηθεί νέοι αλγόριθμοι που ξεπερνούν το πρόβλημα του χώρου χωρίς να θυσιάσουν τη βέλτιστη συμπεριφορά ή την πληρότητα, με μικρό κόστος σε χρόνο εκτέλεσης.

#**Περιγραφή του αλγορίθμου για τη δημιουργία του λαβυρίνθου**
Ο αλγόριθμος που χρησιμοποιήσαμε για τη δημιουργία του λαβυρίνθου είναι Maze Generator. Ορίζεται η οριζόντια και κάθετη διάσταση που θα έχει το πλέγμα του λαβυρίνθου, καθώς και ο δισδιάστατος πίνακας maze που αντιπροσωπεύει το λαβύρινθο, ο οποίος αποτελείται από αντικείμενα της κλάσης Cell. Υπάρχουν οι απαραίτητες μέθοδοι για πρόσβαση και αλλαγή στις μεταβλητές της κλάσης. Η κυριότερη συνάρτηση της κλάσης είναι η generate Maze(, η οποία υποδηλώνει και το όνομα της, δημιουργεί τον τυχαίο λαβύρινθο. Η μέθοδος αυτή καθορίζει τη τελική μορφή που θα έχει ο πίνακας maze. Ξεκινάει με μί άδεια ArraList path η οποί στο τέλος θα περιλαμβάνει όλα τα κελιά του πίνακα Maze. Στη λίστα προστίθεται το κλειδί το αρχικό της γραμμής 2 και στήλης του πίνακα maze. Υπάρχει και η λίστα wall τύπου ArraList η οποία περιέχει τους τοίχους του κάθε κελιού που θα προτίθεται στο μονοπάτι. Πρόκειται για αντικείμενα της κλάσης all.Δηλαδή κάθε κελί που εισέρχεται στην path, στη Wall εισέρχονται 4 τοίχοι, αφού κατά την αρχικοποίησής τους τα αντικείμενα Cell έχουν 4 πιθανούς τοίχους. Η δημιουργία του λαβυρίνθου ολοκληρώνεται όταν στη λίστα path έχουν εισέλθει τα κελιά του πίνακαmaze. Για τον τρόπο διαγραφής τυχαίων τοίχων, ώστε να  δημιουργηθούν πολλαπλά μονοπάτια εντός του πλέγματος. Την διαδικασία αυτή υπάρχει η μεταβλητή Deletion, η οποία σε κάθε κύκλο διαγραφής τοίχου λαμβάνει υπόψιν την τιμή true μόνο αν η διαγραφή είναι επιτυχής, καθώς και η λίστα στη οποία εισέρχονται οι τοίχοι που διαγράφηκαν με επιτυχία ώστε να μην ξαναεπιλεγούν για διαγραφή από την γεννήτρια τυχαίων.

#**Σύγκριση  ανάμεσα σε java και Prolog**
Μία από τις βασικές διαφορές της Prolog από άλλες γλώσσες προγραμματισμού όπως η C, Java, Basic, Fortran κτλ. είναι ότι όταν γράφουμε ένα πρόγραμμα σε Prolog, δηλώνουμε όχι τη σειρά των πεπερασμένων βημάτων που πρέπει να ακολουθήσουμε για να εκτελεστεί επιτυχώς το πρόγραμμα, αλλά τους στόχους που θέλουμε να πετύχουμε καθώς και τη γνώση που έχουμε σχετικά με την επίτευξη των στόχων αυτών. Όπως θα δούμε στις επόμενες ενότητες, η Prolog έχει την δυνατότητα μέσω του μηχανισμού ελέγχου που διαθέτει, να βρίσκει τον τρόπο επίτευξης των στόχων αυτών κάνοντας χρήση της γνώσης που έχουμε εισάγει.
Πιο συγκεκριμένα, στις διαδικαστικές γλώσσες προγραμματισμού (όπως η C, Java, Basic, Fortran κτλ.) μας ενδιαφέρει το ΠΩΣ θα πετύχουμε μία διαδικασία ή μία συνάρτηση (δηλαδή τα λογικά βήματα που πρέπει να ακολουθήσουμε). 
Αντιθέτως, στις δηλωτικές γλώσσες προγραμματισμού όπως η Prolog μας ενδιαφέρει το ΤΙ θέλουμε να πετύχουμε, δηλαδή ποιους στόχους (Goal Directed programming). Αφού έχουμε δηλώσει το τι ισχύει (δηλαδή ποια γεγονότα και κανόνες είναι αληθή) στο πλαίσιο (context) του προβλήματός μας, καθώς και ένα σύνολο κανόνων (της μορφής Horn), η Prolog έχει την ικανότητα ν' αποκρίνεται στις ερωτήσεις που θέτουμε, απαντώντας είτε καταφατικά αν η ερώτηση-στόχος είναι εφικτός είτε αρνητικά αν η ερώτηση είναι ψευδής (δηλαδή ο στόχος δεν μπορεί να επιτευχθεί).
Επιπλέον, η δηλωτική γλώσσα προγραμματισμού Prolog μπορεί να χρησιμοποιηθεί και ως διαδικασική. Στη Prolog ένα πρόγραμμα μπορεί να διαβαστεί με δύο τρόπους: είτε δηλωτικά είτε διαδικασιακά.  η Prolog αποτελείτε από μία βάση δεδομένων και έναν μηχανισμό ελέγχου (ο διερμηνέας) ο οποίος χειρίζεται τη γνώση αυτή προκειμένου να επιτευχθεί ένας στόχος.
Όταν γράφουμε ένα πρόγραμμα σε Prolog δεν κάνουμε τίποτα άλλο από το να εισάγουμε γεγονότα και κανόνες στη βάση δεδομένων, δηλαδή να εισάγουμε γνώση σχετική με το χώρο του προβλήματός μας. Δεδομένου της γνώσης αυτής, μπορούμε να ρωτήσουμε τη Prolog αν μία πρόταση είναι αληθής ή ψευδής. Πιο συγκεκριμένα, ο μηχανισμός ελέγχου της Prolog χρησιμοποιεί τη γνώση αυτή για να αποφανθεί αν η ερώτηση που κάνουμε είναι αληθής ή ψευδής.
Σε αντίθεση με άλλες γλώσσες προγραμματισμού όπου το πρόγραμμα γράφεται μία φορά και μετά μέσω ενός μεταφραστή (compiler) μετατρέπεται σε γλώσσα μηχανής όπου δεν μπορεί πλέον να αλλαχθεί, στη Prolog το πρόγραμμα (δηλαδή η γνώση που εισάγουμε στη βάση δεδομένων) μπορεί να ενημερωθεί ανά πάσα χρονική στιγμή είτε από το χρήστη είτε από το ίδιο το πρόγραμμα.
