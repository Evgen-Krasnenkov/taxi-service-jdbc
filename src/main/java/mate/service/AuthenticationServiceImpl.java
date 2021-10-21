package mate.service;

import java.util.Optional;
import mate.dao.DriverDao;
import mate.exception.AuthenticationException;
import mate.lib.Inject;
import mate.lib.Service;
import mate.model.Driver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Logger logger = LogManager.getLogger(AuthenticationServiceImpl.class);
    @Inject
    private DriverDao driverDao;

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverDao.findByLogin(login);
        if (driver.isEmpty() || !driver.get().getLogin().equals(password)) {
            logger.error("Unauthorized Login or Password: ");
            throw new AuthenticationException("Combination of login and password doesn't exist");
        }
        return driver.get();
    }
}
