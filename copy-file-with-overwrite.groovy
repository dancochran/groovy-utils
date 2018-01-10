import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.NoSuchFileException;

Path source = Paths.get(args[0])
Path target = Paths.get(args[1])
try
{
	Files.delete(target)
}
catch (NoSuchFileException nsfex)
{
	// no-op, nothing was there to delete, we can copy anyway
}

Files.copy(source, target)
