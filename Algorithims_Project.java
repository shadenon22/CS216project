
package com.mycompany.project2;

public class Algorithims_Project {

    public static void main(String[] args) {
    
        Graph graph = new Graph();
        ver();
        

     
    }
    
    public static void ver(){
    Graph graph = new Graph();
     
     //add locations
     
     graph.addLocation("King Fahad Medical City", 24.68925948903841, 46.702784054626754);
     graph.addLocation("Riyadh Military Hospital", 24.69193335171304, 46.713561634924176);
     graph.addLocation("the view mall", 24.698067930582827, 46.72830370694256);
     graph.addLocation("Specialized Medical Center SMC", 24.68032378825368, 46.68737811714428);
     graph.addLocation("King Faisal Specialist Hospital & Research Center", 24.67191158917001, 46.67683166218795);
     graph.addLocation("Al Faisaliah Tower", 24.691182590375817, 46.68502751153736);
     graph.addLocation("Centria Mall", 24.69875565352814, 46.6839977887856);
     graph.addLocation("Olaya District", 24.695276544569854, 46.68044033592393);
     graph.addLocation("King Abdullah Park", 24.667975987674517, 46.73720777136679);
     graph.addLocation("Riyadh Zoo", 24.67666959169154, 46.73716998572585);
     graph.addLocation("Kingdom Center tower", 24.71210858285021, 46.67420247737407);
     graph.addLocation("The Zone", 24.732478199971414, 46.64940564033033);
     graph.addLocation("Taibah Markets", 24.735317929680477, 46.6628282758269);
     graph.addLocation("Riyadh Gallery Mall", 24.74462003865192, 46.65792281449029);
     graph.addLocation("dallah hospital al nakheel", 24.747704268569617, 46.651561886779795);
     graph.addLocation("Ghadder Walking Trail", 24.765375919435836, 46.64892048448933);
     graph.addLocation("King Abdullah Financial District (KAFD)", 24.765880985007918, 46.64329031406684);
     graph.addLocation("Dr. Sulaiman Al Habib Hospital (Al Nakheel)", 24.74280480038756, 46.63516651486599);
     graph.addLocation("Riyadh Park Mall",24.756450299594224, 46.630158219043274);
     graph.addLocation("U walk",24.740393105661372, 46.62608126131189);
     graph.addLocation("alia plaza", 24.80980135857178, 46.669304499747845);
     graph.addLocation("Al-Awwal Stadium", 24.729908042064498, 46.62380674806383);
     graph.addLocation("King Saud University", 24.72339828273881, 46.63440683771308);
     graph.addLocation("King Khaled University Hospital", 24.71361351271707, 46.62140348873023);
     graph.addLocation("boulevard riyadh city", 24.769972588568336, 46.60440901200785);
     graph.addLocation("king khalid grand mosque", 24.706042913507737, 46.65243892885403);
     graph.addLocation("KINGDOM ARENA",24.780376344723397, 46.605782302969594);
     graph.addLocation("Saudi German Hospital", 24.80150291478322, 46.62770885190669);
     graph.addLocation("the Kingdom Hospital", 24.80228032156781, 46.6543230585249);
     graph.addLocation("Al SAHAFAH Distric", 24.79950719526544, 46.64368425646394);
     graph.addLocation("shorofat al nada",24.805239992551996, 46.673907638615326);
     graph.addLocation("Alnada Districk Park",24.801578080606138, 46.68008744825684);
     graph.addLocation("Imam Muhammad ibn Saud Islamic University", 24.81240767759762, 46.70137345842976);
     graph.addLocation("Granada Mall", 24.78279934294067, 46.72961175539085);
     graph.addLocation("Al Hammadi Hospital - Nuzha", 24.75840150728015, 46.70997227307598);
     graph.addLocation("Prince Sultan University", 24.73719966945514, 46.70138920415716);
     graph.addLocation("Hayat Mall", 24.744137433587728, 46.6791590551943);
     graph.addLocation("Park Avenue Mall", 24.829152021490668, 46.72782505525524);
     graph.addLocation("Roshan Front",24.836240431091696, 46.72954166923592);
     graph.addLocation("Princess Nourah bint Abdulrahman University", 24.84800162123033, 46.72550762698541);
     graph.addLocation("King Khalid International Airport", 24.961296364375194, 46.702381969407206);
     graph.addLocation("Riyadh Exhibition Center", 24.756443994726613, 46.72658141950935);
     graph.addLocation("Al Takhassusi Street", 24.709397815145095, 46.6631637483747);
     graph.addLocation("National Museum of Saudi Arabia",24.647921504342428, 46.710654188854825);
     graph.addLocation("King Abdullah Road", 24.751658612324157, 46.72052231768711);
     graph.addLocation("Dar Al Uloom University Hospital", 24.79692241052231, 46.711385046521386);
     graph.addLocation("King Abdullah University Hospital", 24.838259693528187, 46.72224387610815);
     graph.addLocation("Anas Ibn Malik Road", 24.818358461237022, 46.64154860419233);
     graph.addLocation("Al Nakheel Mall", 24.768147557971513, 46.71493600419382);

 
    // add edges
    
graph.addEdge ("Olaya District", "Al Takhassusi Street");
graph.addEdge ("Olaya District", "king khalid grand mosque");
graph.addEdge ("Olaya District", "Al Faisaliah Tower");
graph.addEdge ("Al Faisaliah Tower", "Kingdom Center tower");
graph.addEdge ("Al Faisaliah Tower", "King Abdullah Financial District (KAFD)");
graph.addEdge ("Al Faisaliah Tower", "dallah hospital al nakheel");
graph.addEdge ("Al Takhassusi Street", "King Abdullah Park");
graph.addEdge ("King Abdullah Financial District (KAFD)", "Centria Mall");
graph.addEdge ("King Abdullah Financial District (KAFD)", "The Zone");
graph.addEdge ("King Abdullah Financial District (KAFD)", "Ghadder Walking Trail"); 
graph.addEdge ("King Abdullah Financial District (KAFD)", "");
graph.addEdge ("King Abdullah Financial District (KAFD)", "Riyadh Park Mall");
graph.addEdge ("Kingdom Center tower", "Centria Mall");
graph.addEdge ("Kingdom Center tower", "Specialized Medical Center SMC");
graph.addEdge ("dallah hospital al nakheel", "Ghadder Walking Trail");
graph.addEdge ("dallah hospital al nakheel", "Dr. Sulaiman Al Habib Hospital (Al Nakheel)");
graph.addEdge ("Ghadder Walking Trail", "Dr. Sulaiman Al Habib Hospital (Al Nakheel)");
graph.addEdge ("Ghadder Walking Trail", "Riyadh Park Mall");
graph.addEdge ("Dr. Sulaiman Al Habib Hospital (Al Nakheel)", "King Saud University");
graph.addEdge ("Dr. Sulaiman Al Habib Hospital (Al Nakheel)", "King Faisal Specialist Hospital & Research Center");
graph.addEdge ("Centria Mall", "Specialized Medical Center SMC");
graph.addEdge ("Centria Mall", "The Zone");
graph.addEdge ("Specialized Medical Center SMC", "King Fahad Medical City");
graph.addEdge ("Specialized Medical Center SMC", "Riyadh Military Hospital");
graph.addEdge ("king khalid grand mosque", "Riyadh Military Hospital");
graph.addEdge ("king khalid grand mosque", "the view mall");
graph.addEdge ("King Abdullah Park", "King Faisal Specialist Hospital & Research Center");
graph.addEdge ("King Abdullah Park", " Riyadh Zoo");
graph.addEdge ("King Faisal Specialist Hospital & Research Center", "King Saud University");
graph.addEdge ("King Faisal Specialist Hospital & Research Center", "boulevard riyadh city");
graph.addEdge ("King Faisal Specialist Hospital & Research Center", " Riyadh Zoo");
graph.addEdge ("Riyadh Military Hospital", "the view mall");
graph.addEdge ("Riyadh Military Hospital", "alia plaza");
graph.addEdge ("Riyadh Military Hospital", "King Fahad Medical City");
graph.addEdge ("Riyadh Park Mall", "Riyadh Gallery Mall");
graph.addEdge ("Riyadh Park Mall", "The Zone");
graph.addEdge ("Riyadh Park Mall", "King Saud University");
graph.addEdge ("King Saud University", "Al-Awwal Stadium");
graph.addEdge ("The Zone", "King Fahad Medical City");
graph.addEdge ("The Zone", "Saudi German Hospital");
graph.addEdge ("King Fahad Medical City", "Al SAHAFAH Distric");
graph.addEdge (" Riyadh Zoo", "National Museum of Saudi Arabia");
graph.addEdge ("National Museum of Saudi Arabia", "King Khaled University Hospital");
graph.addEdge ("National Museum of Saudi Arabia", "boulevard riyadh city");
graph.addEdge ("boulevard riyadh city", "Al-Awwal Stadium");
graph.addEdge ("boulevard riyadh city", "U walk");
graph.addEdge ("boulevard riyadh city", "King Khaled University Hospital");
graph.addEdge ("boulevard riyadh city", "Riyadh Exhibition Center");
graph.addEdge ("Al-Awwal Stadium", "Riyadh Gallery Mall");
graph.addEdge ("Al-Awwal Stadium", "U walk");
graph.addEdge ("U walk", "Taibah Markets");
graph.addEdge ("U walk", "Hayat Mall");
graph.addEdge ("King Khaled University Hospital", "The Esplanade");
graph.addEdge ("The Esplanade", "Prince Sultan University");
graph.addEdge ("The Esplanade", "Riyadh Exhibition Center");
graph.addEdge ("Riyadh Exhibition Center", "Hayat Mall");
graph.addEdge ("Riyadh Exhibition Center", "Prince Sultan University");
graph.addEdge ("Riyadh Exhibition Center", "Granada Mall");
graph.addEdge ("Riyadh Exhibition Center", "Al Nakheel Mall");
graph.addEdge ("Hayat Mall", "KINGDOM ARENA");
graph.addEdge ("KINGDOM ARENA", "Taibah Markets");
graph.addEdge ("KINGDOM ARENA", "Al Nakheel Mall");
graph.addEdge ("Taibah Markets", "the Kingdom Hospital"); 
graph.addEdge ("Taibah Markets", "Riyadh Gallery Mall");
graph.addEdge ("Riyadh Gallery Mall", "the Kingdom Hospital");
graph.addEdge ("Riyadh Gallery Mall", "Saudi German Hospital");
graph.addEdge ("the Kingdom Hospital", "Saudi German Hospital");
graph.addEdge ("the Kingdom Hospital", "Alnada Districk Park");
graph.addEdge ("the Kingdom Hospital", "Al Nakheel Mall");
graph.addEdge ("Prince Sultan University", "Granada Mall");
graph.addEdge ("Granada Mall", "Al Hammadi Hospital - Nuzha");
graph.addEdge ("Al Hammadi Hospital - Nuzha", "Al Nakheel Mall"); 
graph.addEdge ("Al Hammadi Hospital - Nuzha", "King Abdullah Road");
graph.addEdge ("Al Nakheel Mall", "Imam Muhammad ibn Saud Islamic University");
graph.addEdge ("Al Nakheel Mall", "Park Avenue Mall");
graph.addEdge ("Al Nakheel Mall", "King Abdullah Road");
graph.addEdge ("King Abdullah Road", "Dar Al Uloom University Hospital ");
graph.addEdge ("Dar Al Uloom University Hospital ", "King Khalid International Airport");
graph.addEdge ("Dar Al Uloom University Hospital ", "Park Avenue Mall");
graph.addEdge ("King Khalid International Airport", "Park Avenue Mall");
graph.addEdge ("King Khalid International Airport", "King Abdullah University Hospital");
graph.addEdge ("Park Avenue Mall", "Princess Nourah bint Abdulrahman University");
graph.addEdge ("Park Avenue Mall", "alia plaza");
graph.addEdge ("Park Avenue Mall", "King Abdullah University Hospital");
graph.addEdge ("Imam Muhammad ibn Saud Islamic University", "Princess Nourah bint Abdulrahman University");
graph.addEdge ("Imam Muhammad ibn Saud Islamic University", "Alnada Districk Park");
graph.addEdge ("Princess Nourah bint Abdulrahman University", "Roshan Front");
graph.addEdge ("Alnada Districk Park", "Roshan Front"); 
graph.addEdge ("Alnada Districk Park", "Saudi German Hospital");
graph.addEdge ("Roshan Front", "Al SAHAFAH Distric");
graph.addEdge ("Roshan Front", "alia plaza");
graph.addEdge ("Saudi German Hospital", "Al SAHAFAH Distric");
graph.addEdge ("Al SAHAFAH Distric", "alia plaza");
graph.addEdge ("King Abdullah University Hospital", "Anas Ibn Malik Road");
graph.addEdge ("Anas Ibn Malik Road", "shorofat al nada");
graph.addEdge ("alia plaza", "Anas Ibn Malik Road"); 
graph.addEdge ("alia plaza", "shorofat al nada");
graph.addEdge ("shorofat al nada", "the view mall");

    
    
    
    
    Kruskal kr = new Kruskal(graph);
    kr.kruskalMST();
    graph.display_graph();
    kr.display_kruskal();
    
    }
}
