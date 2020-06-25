package sorucozumleri;

public class populationprojeckt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // We have 1 birth every 7 seconds, thats per year, per day, per hour, per minute,
        // so 365 * 24 * 60 * 60 / 7, or the total seconds per year / 7 = number of births
        // again we have 1 new immigrant every 45 seconds
        // so 365 * 24 * 60 * 60 / 45, total seconds / 45 = number of immigrants
        // and number of deaths / second
        // is 365 * 24 * 60 * 60 / 13, total seconds / 13 = number of deaths
        // finally, the total population is
        // current population + births + immigrants - deaths = total population
        // and multiply to get the next 5 years

        System.out.println((int)(((365 * 24 * 60 * 60 / 7.0) + (365 * 24 * 60 * 60 / 45) - (365 * 24 * 60 * 60 / 13))) + 312032486);
        System.out.println((int)(((365 * 24 * 60 * 60 / 7.0) + (365 * 24 * 60 * 60 / 45) - (365 * 24 * 60 * 60 / 13)) * 2) + 312032486);
        System.out.println((int)(((365 * 24 * 60 * 60 / 7.0) + (365 * 24 * 60 * 60 / 45) - (365 * 24 * 60 * 60 / 13)) * 3) + 312032486);
        System.out.println((int)(((365 * 24 * 60 * 60 / 7.0) + (365 * 24 * 60 * 60 / 45) - (365 * 24 * 60 * 60 / 13)) * 4) + 312032486);
        System.out.println((int)(((365 * 24 * 60 * 60 / 7.0) + (365 * 24 * 60 * 60 / 45) - (365 * 24 * 60 * 60 / 13)) * 5) + 312032486);	

	}

}
