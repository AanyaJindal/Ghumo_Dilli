package com.example.aanya.ghumodilli;

import java.util.ArrayList;

/**
 * Created by aanya on 6/29/2016.
 */
public class Places {

    public static class Place {
        int imageID;
        int[] bigImageID = new int[4];
        int entryFees;
        String name;
        String timings;
        String description;
        String location;
        String mapLocation;
        String wikiLink;
        String delhiLink;
        String otherLink;
        String contact;

        public Place(int imageID, int bigImageID[], int entryFees, String name, String timings, String description, String location,String mapLocation, String wikiLink,String delhiLink,String otherLink, String contact) {
            this.imageID = imageID;
            this.bigImageID[0] = bigImageID[0];
            this.bigImageID[1] = bigImageID[1];
            this.bigImageID[2] = bigImageID[2];
            this.bigImageID[3] = bigImageID[3];
            this.entryFees = entryFees;
            this.name = name;
            this.timings = timings;
            this.description = description;
            this.location = location;
            this.mapLocation = mapLocation;
            this.wikiLink = wikiLink;
            this.delhiLink = delhiLink;
            this.otherLink = otherLink;
            this.contact = contact;
        }
    }

    public static ArrayList<Place> getPlaces(){
        ArrayList<Place> placeList = new ArrayList<>();

        int indiaGate[] = {R.drawable.india_gate_big,R.drawable.india_gate_big_1, R.drawable.india_gate_big_2, R.drawable.india_gate_big_3};
        int akshardhamTemple[] = {R.drawable.akshardham_temple_big,R.drawable.akshardham_temple_big_1,R.drawable.akshardham_temple_big_2,R.drawable.akshardham_temple_big_3};
        int hauzKhasComplex[] = {R.drawable.hauz_khas_complex_big,R.drawable.hauz_khas_complex_big_1,R.drawable.hauz_khas_complex_big_2,R.drawable.hauz_khas_complex_big_3};
        int humayunTomb[] = {R.drawable.humayun_tomb_big,R.drawable.humayun_tomb_big_1,R.drawable.humayun_tomb_big_2,R.drawable.humayun_tomb_big_3};
        int jamaMasjid[] = {R.drawable.jama_masjid_big,R.drawable.jama_masjid_big_1,R.drawable.jama_masjid_big_2,R.drawable.jama_masjid_big_3};
        int jantarMantar[] = {R.drawable.jantar_mantar_big,R.drawable.jantar_mantar_big_1,R.drawable.jantar_mantar_big_2,R.drawable.jantar_mantar_big_3};
        int lodiGardens[] = {R.drawable.lodi_gardens_big,R.drawable.lodi_gardens_big_1,R.drawable.lodi_gardens_big_2,R.drawable.lodi_gardens_big_3};
        int lotusTemple[] = {R.drawable.lotus_temple_big,R.drawable.lotus_temple_big_1,R.drawable.lotus_temple_big_2,R.drawable.lotus_temple_big_3};
        int redFort[] = {R.drawable.red_fort_big,R.drawable.red_fort_big_1,R.drawable.red_fort_big_2,R.drawable.red_fort_big_3};
        int qutubMinar[] = {R.drawable.qutub_minar_big,R.drawable.qutub_minar_big_1,R.drawable.qutub_minar_big_2,R.drawable.qutub_minar_big_3};



        placeList.add(new Place(R.drawable.india_gate,indiaGate,0, "India Gate","5:00 A.M. - 12:00 Midnight",/*in the detailsfragment.java set text of fees to no entry fees if 0 input here*/
                "Synonymous with New Delhi and situated in the heart of the city, India Gate is one of the most popular monuments in the city. The foundation stone of India Gate was laid in 1920 and the structure was unveiled in 1933. Designed by Edwin Lutyens, India Gate was dedicated to all the Indian soldiers of the British Army who died in World War I. Another memorial, the Amar Jawan Jyoti was added later and was dedicated to soldiers who sacrificed their lives in the Indo-Pakistan war of 1971.",
                "Rajpath, India Gate, New Delhi, Delhi","geo:28.6124081,77.2281149?z=17",
                "https://en.wikipedia.org/wiki/India_Gate","http://www.delhitourism.gov.in/delhitourism/tourist_place/india_gate.jsp","http://www.indiagate.org.in/"
                ,"01124647005"));
        placeList.add(new Place(R.drawable.akshardham_temple,akshardhamTemple,0,"Akshardham Temple", "6:30 A.M. - 8:00 P.M.\nMonday closed",
                "Swaminarayan Akshardham in New Delhi epitomizes 10,000 years of Indian culture in all its breathtaking grandeur, beauty, wisdom an d bliss. It brilliantly showcases the essence of India’s ancient architecture, traditions and timeless spiritual messages. The Akshardham experience is an enlightening journey through India’s glorious art, values and contributions for the progress, happiness and harmony of mankind.",
                "Swaminarayan Akshardham\n" + "NH 24, Akshardham Setu, New Delhi 110092.","geo:28.6126735,77.2750732?z=17",
                "https://en.wikipedia.org/wiki/Akshardham_(Delhi)","http://www.delhitourism.gov.in/delhitourism/tourist_place/akshardham_temple.jsp","http://akshardham.com/",
                "01143442344"));
        placeList.add(new Place(R.drawable.hauz_khas_complex,hauzKhasComplex,0,"Hauz Khas Complex","10:30 A.M. - 7:00 P.M.\nSunday closed",
                "Welcome to Delhi's charming  Hauz Khas Village, with its pleasant gardens, quaint little shops, restaurants and cafés, and a cluster of magnificent medieval buildings set around a reservoir. The village has something to offer for everyone. Once an important Islamic learning centre (due to the Madrasa located in the area), this place used to attract Islamic scholars from far and beyond. But the real attraction of this place lies not in its splendid architecture or even in its status of being an academic centre, but in the sheer magical beauty of the place. Today, Hauz Khas Village still holds on to some of its old charm with loads of quirky touches.",
                "Hauz Khas, South Delhi, Delhi 110016","geo:28.5548815,77.1898059?z=15",
                "https://en.wikipedia.org/wiki/Hauz_Khas_Complex","http://delhi.gov.in/wps/wcm/connect/DoIT_Shahjahanabad/doit_shahjahanabad/home/heritage+walk/hauz+khas","https://www.tripoto.com/trip/things-you-should-know-about-hauz-khas-complex-6608",
                "No contact"));/*Add a feature so that when no contact detail then do something*/
        placeList.add(new Place(R.drawable.humayun_tomb,humayunTomb,30,"Humayun's Tomb","8:00 A.M. - 6:00 P.M.",
                "Located near the crossing of Mathura road and Lodhi road, this magnificent garden tomb is the first substantial example of Mughal architecture in India.It was built in 1565 A.D. nine years after the death of Humayun, by his senior widow Bega Begam. Inside the walled enclosure the most notable features are the garden squares (chaharbagh) with pathways water channels, centrally located well proportional mausoleum topped by double dome.",
                "Mathura Road, Nizamuddin, Opp. Dargah, New Delhi, Delhi 110013","geo:28.5933079,77.2485121?z=17",
                "https://en.wikipedia.org/wiki/Humayun%27s_Tomb","http://www.delhitourism.gov.in/delhitourism/tourist_place/humayun_tomb.jsp","http://asi.nic.in/asi_monu_whs_humayuntomb.asp",
                "01124355275"));
        placeList.add(new Place(R.drawable.jama_masjid,jamaMasjid,0,"Jama Masjid","7:00AM – 12:00PM\n" + "1:30P.M. – 6:30PM",
                "This great mosque of Old Delhi is the largest in India, with a courtyard capable of holding 25,000 devotees. It was begun in 1644 and ended up being the final architectural extravagance of Shah Jahan, the Mughal emperor who built the Taj Mahal and the Red Fort.",
                "Chandni Chowk, New Delhi, Delhi 110006","geo:28.6506792,77.2312534?z=17",
                "https://en.wikipedia.org/wiki/Jama_Masjid,_Delhi","http://www.delhitourism.gov.in/delhitourism/tourist_place/jama_masjid.jsp","http://www.culturalindia.net/monuments/jama-masjid.html",
                "01123365358"));
        placeList.add(new Place(R.drawable.jantar_mantar,jantarMantar,5,"Jantar Mantar","6:00AM – 6:00PM",
                "The Jantar Mantar is an astronomical observation site built in the early 18th century. It includes a set of some 20 main fixed instruments. They are monumental examples in masonry of known instruments but which in many cases have specific characteristics of their own. Designed for the observation of astronomical positions with the naked eye, they embody several architectural and instrumental innovations. This is the most significant, most comprehensive, and the best preserved of India's historic observatories. It is an expression of the astronomical skills and cosmological concepts of the court of a scholarly prince at the end of the Mughal period.",
                "Sansad Marg, Connaught Place, New Delhi, Delhi 110001","geo:28.6270547,77.214438?z=17",
                "https://en.wikipedia.org/wiki/Jantar_Mantar,_New_Delhi","http://www.delhitourism.gov.in/delhitourism/tourist_place/jantar_mantar.jsp","http://www.jantarmantar.org/",
                "01123365358"));
        placeList.add(new Place(R.drawable.lodi_gardens,lodiGardens,0,"Lodi Gardens","6:00 AM - 7:30 PM",
                "The old Lady Willington Park, now known as Lodhi Garden, is dotted with monuments of Sayyid and Lodhi Periods, which include tombs mosques, and bridges .The tombs of Muhammad Shah and Sikandar Lodhi are the good examples of octagonal tombs. Shish and Bara Gumbad are square tombs with imposing dome, turrets on corners and facades giving false impression of being double storeyed.",
                "Lodhi Rd, New Delhi, Delhi 110003","geo:28.5930952,77.2174906?z=17",
                "https://en.wikipedia.org/wiki/Lodi_Garden","http://www.delhitourism.gov.in/delhitourism/tourist_place/lodi_tomb.jsp","",
                "01124640079"));
        placeList.add(new Place(R.drawable.lotus_temple,lotusTemple,0,"Lotus Temple","9:00 AM – 7:00 PM\nMonday closed",
                "East of Nehru place, this temple is built in the shape of a lotus flower and is the last of seven Major Bahai's temples built around the world. Completed in1986 it is set among the lush green landscaped gardens.The structure is made up of pure white marble The architect Furiburz Sabha chose the lotus as the symbol common to Hinduism, Buddhism,  Bhai TempleJainism and Islam. Adherents of any faith are free to visit the temple and pray or meditate.Around the blooming petals there are nine pools of water, which light up, in natural light. It looks spectacular at dusk when it is flood lit.",
                "Lotus Temple Rd, Shambhu Dayal Bagh, Bahapur, Kalkaji, New Delhi, Delhi 110019","geo:28.5534967,77.2566377?z=17",
                "https://en.wikipedia.org/wiki/Lotus_Temple","http://www.delhitourism.gov.in/delhitourism/tourist_place/bahai_temple.jsp","http://www.bahaihouseofworship.in/",
                "01126444029"));
        placeList.add(new Place(R.drawable.qutub_minar,qutubMinar,30,"Qutub Minar","7:00AM – 5:00PM",
                "Qutab Minar is a soaring, 73 m-high tower of victory, built in 1193 by Qutab-ud-din Aibak immediately after the defeat of Delhi's last Hindu kingdom. The tower has five distinct storeys, each marked by a projecting balcony and tapers from a 15 m diameter at the base to just 2.5 m at the top. The first three storeys are made of red sandstone; the fourth and fifth storeys are of marble and sandstone. At the foot of the tower is the Quwwat-ul-Islam Mosque, the first mosque to be built in India. An inscription over its eastern gate provocatively informs that it was built with material obtained from demolishing '27 Hindu temples'. A 7 m-high iron pillar stands in the courtyard of the mosque. It is said that if you can encircle it with your hands while standing with your back to it your wish will be fulfilled.",
                "Mehrauli, New Delhi, Delhi 110030","geo:28.5244281,77.1832672?z=17",
                "https://en.wikipedia.org/wiki/Qutb_Minar","http://www.delhitourism.gov.in/delhitourism/tourist_place/qutab_minar.jsp","http://www.qutubminar.org/",
                "01124698431"));
        placeList.add(new Place(R.drawable.red_fort,redFort,10,"Red Fort","9:30 AM - 4:30 PM",
                "The Red Fort or the Lal Quila as it is traditionally called is situated in old Delhi, the capital of India. The Red Fort was built by the Mughal Emperor Shah Jahan in the 17th century that took around 9 years to complete this magnificent structure and around 10 million rupees to build the fort. The Red Fort is a masterpiece of architecture and is one of the most visited spot in old Delhi. Tourists from India and abroad never miss the opportunity to visit this huge structure.The Red Fort Delhi is a mesmerizing piece of architecture, lying on the banks of Yamuna River, whose water was used for the moat that surround the wall. The wall on north-eastern side is bordered by the Salimgarh Fort, built in 1546.",
                "Netaji Subhash Marg, Chandni Chowk, New Delhi, Delhi 110006","geo:28.6561592,77.2388316?z=17",
                "https://en.wikipedia.org/wiki/Red_Fort","http://asi.nic.in/asi_monu_tktd_delhi_redfort.asp","http://www.redfortdelhi.co.in/",
                "01123277705"));
        return placeList;
    }

}


