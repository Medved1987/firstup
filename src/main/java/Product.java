import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class Product extends HttpServlet {
    private static Logger Logger = LoggerFactory.getLogger(Product.class);

    @Override
    public void init() throws ServletException {
        Logger.debug("init");

    }

}
