import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurtirPublicacao implements Interação {
    @Override
    public void executarInteracao() {
        // Configurar o WebDriver
        System.setProperty("webdriver.chrome.driver", "/caminho/para/o/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Maximizar a janela do navegador
        driver.manage().window().maximize();

        // URL da publicação que você deseja curtir
        String urlPublicacao = "https://www.instagram.com/p/123456/";

        // Abrir a página da publicação
        driver.get(urlPublicacao);

        try {
            // Esperar um tempo para a página carregar completamente
            Thread.sleep(3000);

            // Localizar o botão de curtir e clicar nele
            WebElement likeButton = driver.findElement(By.xpath("//button[@aria-label='Like']"));
            likeButton.click();

            // Exibir mensagem de sucesso
            System.out.println("Publicação curtida com sucesso!");
        } catch (Exception e) {
            // Exibir mensagem de erro em caso de falha
            System.out.println("Erro ao curtir a publicação: " + e.getMessage());
        } finally {
            // Fechar o navegador
            driver.quit();
        }
    }
}
