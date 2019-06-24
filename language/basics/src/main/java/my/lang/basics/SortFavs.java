package my.lang.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import my.lang.basics.domains.Album;
import my.lang.basics.domains.Track;


public class SortFavs {
	
	
	public List sortImperativeStyle(List<Album> albums){
		List<Album> favs = new ArrayList<>();

		for (Album a : albums) {
		    boolean hasFavorite = false;
		    for (Track t : a.tracks) {
		        if (t.rating >= 4) {
		            hasFavorite = true;
		            break;
		        }
		    }
		    if (hasFavorite)
		        favs.add(a);
		}

		Collections.sort(favs, new Comparator<Album>() {
		                           public int compare(Album a1, Album a2) {
		                               return a1.name.compareTo(a2.name);
		                           }});
		return favs; 
	}
	

	@java.lang.SuppressWarnings("squid:S1854")
	public List sortFunctional(List<Album> albums){
		
		return 
				  albums.stream()
				        .filter(a -> a.tracks.stream().anyMatch(t -> (t.rating >= 4)))
				        .sorted(Comparator.comparing(a -> a.name))
				        .collect(Collectors.toList());				
	}

}
