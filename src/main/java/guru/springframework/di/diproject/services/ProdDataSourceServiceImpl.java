package guru.springframework.di.diproject.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("Prod")
@Service("dataSource")
public class ProdDataSourceServiceImpl implements DataSourceService{
    @Override
    public String getDataSource() {
        return "Prod";
    }
}
