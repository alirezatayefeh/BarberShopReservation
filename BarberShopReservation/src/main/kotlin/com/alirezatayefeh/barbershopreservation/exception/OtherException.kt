import com.alirezatayefeh.barbershopreservation.exception.base.BadRequestException

class UserNameInvalidException(text: String) : BadRequestException()

class PhoneNumberInvalidException(text: String) : BadRequestException()