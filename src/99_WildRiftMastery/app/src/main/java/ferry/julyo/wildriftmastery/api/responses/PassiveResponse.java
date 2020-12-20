package ferry.julyo.wildriftmastery.api.responses;


public class PassiveResponse {

    private String name;
    private String description;
    private ImageResponse image;

    public PassiveResponse(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ImageResponse getImage() {
        return image;
    }

    public void setImage(ImageResponse image) {
        this.image = image;
    }
}
