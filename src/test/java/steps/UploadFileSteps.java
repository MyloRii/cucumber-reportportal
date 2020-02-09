package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import lombok.AllArgsConstructor;
import pages.UploadFilePage;

import static com.codeborne.selenide.Condition.visible;

@AllArgsConstructor
public class UploadFileSteps {

    private UploadFilePage uploadFilePage;

    @And("User uploads file")
    public void userUploadsFile() {
        uploadFilePage.uploadFile();
    }

    @Then("File appears as uploaded")
    public void fileIsUploaded() {
        uploadFilePage
                .getUploadedFileName()
                .shouldBe(visible);
    }
}
