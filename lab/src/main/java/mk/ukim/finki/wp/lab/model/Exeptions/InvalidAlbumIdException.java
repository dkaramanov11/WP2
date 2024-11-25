package mk.ukim.finki.wp.lab.model.Exeptions;

public class InvalidAlbumIdException extends RuntimeException{
    public InvalidAlbumIdException(Long albumId){
        super(String.format("Album with id: %d was not found", albumId));


    }
}
