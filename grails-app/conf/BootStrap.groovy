import gorm.recipes.Artist
import gorm.recipes.Work

class BootStrap {

    def init = { servletContext ->

        if(!Artist.count()) {
            new Artist(name: 'Bill Conner', birthDate: new Date('4/7/1972'), home: 'El Paso, TX', style: 'Modern').save()
            new Artist(name: 'Warren Levin', birthDate: new Date('3/19/1969'), home: 'San Antonio, TX', style: 'Classic').save()
            new Artist(name: 'Cindy Mark', birthDate: new Date('1/1/1983'), home: 'Austin, TX', style: 'Abstract').save()
            new Artist(name: 'Todd Dander', birthDate: new Date('9/11/1958'), home: 'Dallas, TX', style: 'Abstract').save()
            new Artist(name: 'Lucy Sparks', birthDate: new Date('6/4/1962'), home: 'Austin, TX', style: 'Modern').save()
            new Artist(name: 'Richard Corsin', birthDate: new Date('7/4/1976'), home: 'San Antonio, TX', style: 'Modern').save()
            new Artist(name: 'Anna Heart', birthDate: new Date('11/12/1966'), home: 'Dallas, TX', style: 'Classic').save()
            new Artist(name: 'Leslie Derby', birthDate: new Date('12/15/1990'), home: 'Dallas, TX', style: 'Abstract').save()
            new Artist(name: 'Clint Fallow', birthDate: new Date('9/22/1971'), home: 'Austin, TX', style: 'Modern').save()
            new Artist(name: 'Lucy Peters', birthDate: new Date('5/23/1981'), home: 'El Paso, TX', style: 'Classic').save()

            new Work(title: 'Falling Star', created: new Date('4/5/2011'), price: 1000, artist: Artist.findByName('Bill Conner')).save()
            new Work(title: 'Blue Moon', created: new Date('6/11/2011'), price: 950, artist: Artist.findByName('Bill Conner')).save()
            new Work(title: 'Mars Alive', created: new Date('2/1/2011'), price: 975, artist: Artist.findByName('Bill Conner')).save()

            new Work(title: 'Old Woman', created: new Date('8/3/2010'), price: 1500, artist: Artist.findByName('Warren Levin')).save()
            new Work(title: 'Old Shoe', created: new Date('3/16/2010'), price: 1500, artist: Artist.findByName('Warren Levin')).save()
            new Work(title: 'Very Old Woman', created: new Date('11/1/2010'), price: 1800, artist: Artist.findByName('Warren Levin')).save()
            new Work(title: 'Young Woman', created: new Date('12/9/2010'), price: 1700, artist: Artist.findByName('Warren Levin')).save()

            new Work(title: 'Shades of Grey', created: new Date('8/30/2011'), price: 600, artist: Artist.findByName('Cindy Mark')).save()
            new Work(title: 'Autumn in Yellow', created: new Date('8/4/2010'), price: 550, artist: Artist.findByName('Cindy Mark')).save()
            new Work(title: 'Deep Black', created: new Date('4/19/2011'), price: 700, artist: Artist.findByName('Cindy Mark')).save()

            new Work(title: 'Fat Cat', created: new Date('6/1/2011'), price: 295, artist: Artist.findByName('Todd Dander')).save()
            new Work(title: 'Big Dog', created: new Date('7/22/2011'), price: 295, artist: Artist.findByName('Todd Dander')).save()
            new Work(title: 'Pink Gerbil', created: new Date('8/4/2011'), price: 345, artist: Artist.findByName('Todd Dander')).save()
            new Work(title: 'Running Hamster', created: new Date('8/29/2011'), price: 345, artist: Artist.findByName('Todd Dander')).save()
            new Work(title: 'Crazy Horse', created: new Date('9/14/2011'), price: 600, artist: Artist.findByName('Todd Dander')).save()

            new Work(title: 'Dust Storm', created: new Date('12/13/2010'), price: 875, artist: Artist.findByName('Lucy Sparks')).save()
            new Work(title: 'Marble Storm', created: new Date('3/15/2011'), price: 995, artist: Artist.findByName('Lucy Sparks')).save()
            new Work(title: 'Diamond Storm', created: new Date('4/9/2011'), price: 1350, artist: Artist.findByName('Lucy Sparks')).save()

            new Work(title: 'Windmill Falling', created: new Date('1/15/2011'), price: 1000, artist: Artist.findByName('Richard Corsin')).save()
            new Work(title: 'Flag on a Breeze', created: new Date('2/12/2011'), price: 950, artist: Artist.findByName('Richard Corsin')).save()
            new Work(title: 'Nine Leaves', created: new Date('3/17/2011'), price: 975, artist: Artist.findByName('Richard Corsin')).save()
            new Work(title: 'Moon Nuts', created: new Date('4/4/2011'), price: 975, artist: Artist.findByName('Richard Corsin')).save()
            new Work(title: 'Cedar Plank', created: new Date('4/27/2011'), price: 975, artist: Artist.findByName('Richard Corsin')).save()

            new Work(title: 'Horn and Drum', created: new Date('9/14/2010'), price: 1600, artist: Artist.findByName('Anna Heart')).save()
            new Work(title: 'Bayou Billy', created: new Date('9/19/2010'), price: 1650, artist: Artist.findByName('Anna Heart')).save()
            new Work(title: 'Roughing It', created: new Date('11/14/2010'), price: 1500, artist: Artist.findByName('Anna Heart')).save()
            new Work(title: 'Laser Focus', created: new Date('12/19/2010'), price: 2200, artist: Artist.findByName('Anna Heart')).save()

            new Work(title: 'Watching the Moon', created: new Date('6/1/2011'), price: 790, artist: Artist.findByName('Leslie Derby')).save()
            new Work(title: 'Moonrise Over Shame', created: new Date('6/27/2011'), price: 825, artist: Artist.findByName('Leslie Derby')).save()
            new Work(title: 'Feral Harness', created: new Date('7/7/2011'), price: 820, artist: Artist.findByName('Leslie Derby')).save()
            new Work(title: 'Granite Doll', created: new Date('8/2/2011'), price: 710, artist: Artist.findByName('Leslie Derby')).save()
            new Work(title: 'Vodka Sunrise', created: new Date('9/6/2011'), price: 900, artist: Artist.findByName('Leslie Derby')).save()

            new Work(title: 'Bull and China', created: new Date('3/1/2011'), price: 1150, artist: Artist.findByName('Clint Fallow')).save()
            new Work(title: 'Tip the Boat', created: new Date('4/20/2011'), price: 975, artist: Artist.findByName('Clint Fallow')).save()
            new Work(title: 'Calm Raft', created: new Date('6/9/2011'), price: 1100, artist: Artist.findByName('Clint Fallow')).save()
            new Work(title: 'River Surge', created: new Date('8/12/2011'), price: 1275, artist: Artist.findByName('Clint Fallow')).save()

            new Work(title: 'Still in Yellow', created: new Date('10/15/2010'), price: 695, artist: Artist.findByName('Lucy Peters')).save()
            new Work(title: 'Rags on Fire', created: new Date('12/12/2010'), price: 570, artist: Artist.findByName('Lucy Peters')).save()
            new Work(title: 'Spin the Moon', created: new Date('2/5/2011'), price: 610, artist: Artist.findByName('Lucy Peters')).save()
            new Work(title: 'Field of Fey', created: new Date('3/14/2011'), price: 750, artist: Artist.findByName('Lucy Peters')).save()
            new Work(title: 'Sunflower Vengence', created: new Date('5/21/2011'), price: 600, artist: Artist.findByName('Lucy Peters')).save()
        }

    }

    def destroy = {
    }
}
