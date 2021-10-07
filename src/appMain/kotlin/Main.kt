import kotlinx.cli.ArgParser
import kotlinx.cli.ArgType

fun main(args: Array<String>) {
    val parser = ArgParser("kml-to-discover-media-vcard")
    val input by parser.argument(ArgType.String, "input", "KML input file")
    val output by parser.option(ArgType.String, "output", "o", "Output directory for vCard files")

    parser.parse(args)

    println("Your input is $input and your output $output")
}
