package yangyx30678.bread;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BakeABread implements ModInitializer {
	public static final String MOD_ID = "bakeabread";
    public static final Logger LOGGER = LoggerFactory.getLogger("bake-a-bread");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}