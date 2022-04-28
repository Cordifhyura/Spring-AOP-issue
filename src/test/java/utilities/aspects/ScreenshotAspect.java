package utilities.aspects;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ScreenshotAspect {
    @Around("@annotation(TakeFullScrShot)")
    public void take(){
        System.out.println("simulate screen capture");
    }
}
