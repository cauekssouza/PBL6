import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seguir extends Interação {
    private Instagram perfil;
    private Instagram perfilAlvo;
    
    public Seguir(Instagram perfil, Instagram perfilAlvo){
        this.perfil = perfil;
        this.perfilAlvo = perfilAlvo;
    }
    @Override
    public void  realizarAção(){
        System.out.println(perfil.getUsuario() + " Está Seguindo" + perfilAlvo.getUsuario() + "...");
        // Seguir o perfil
        public static void seguirPerfil(Instagram perfil, Instagram perfilAlvo) {
            // Configurar o WebDriver
            System.setProperty("webdriver.chrome.driver", "/caminho/para/o/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
    
            try {
                // Navegar para o perfil alvo
                driver.get("https://www.instagram.com/" + perfilAlvo.getUsuario());
    
                // Encontrar e clicar no botão de seguir
                WebElement followButton = driver.findElement(By.xpath("//button[contains(text(), 'Follow')]"));
                followButton.click();
    
                // Aguardar alguns segundos para a ação ser concluída
                Thread.sleep(30);
    
                // Exibir mensagem de sucesso
                System.out.println(perfil.getUsuario() + " seguiu " + perfilAlvo.getUsuario());
            } catch (Exception e) {
                System.out.println("Erro ao seguir o perfil: " + e.getMessage());
            } finally {
                // Fechar o navegador
                driver.quit();
    }
}
