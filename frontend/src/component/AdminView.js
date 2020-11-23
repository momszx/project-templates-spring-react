import React from "react";
import {Formik} from "formik";
import * as Yup from "yup";
import { parse, isDate } from "date-fns";
function parseDateString(value, originalValue) {
    const parsedDate = isDate(originalValue)
        ? originalValue
        : parse(originalValue, "yyyy-MM-dd", new Date());

    return parsedDate;
}
const AdminView = () => (
    <Formik
        initialValues={{Name: "", ID: "", DateOfBirth: ""}}
        onSubmit={(values, {setSubmitting}) => {
            setTimeout(() => {
                //LoginActions.login(values);
                console.log("Ámen");
                setSubmitting(false);
            }, 500);
        }}

        validationSchema={Yup.object().shape({
            Name: Yup.string()
                .required("Név megadása kötelező"),
            ID: Yup.number()
                .required("Nem lehet üres!").positive().integer(),
            DateOfBirth: Yup.string()
                .required("Kötelező megadni!")
        })}
    >
        {props => {
            const {
                values,
                touched,
                errors,
                isSubmitting,
                handleChange,
                handleBlur,
                handleSubmit
            } = props;
            return (
                <form onSubmit={handleSubmit}>
                    <div className="form-group">
                        <label htmlFor="email">Email</label>
                        <input
                            name="email"
                            type="text"
                            placeholder="Add meg az email címed"
                            value={values.email}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            className={ errors.email && touched.email ? "form-control is-invalid" : "form-control"}
                        />
                        {errors.email && touched.email && (
                            <div className={"invalid-feedback"}>{errors.email} </div>
                        )}
                    </div>
                    <div className={"form-group"}>
                        <label htmlFor="email">ID</label>
                        <input
                            name="ID"
                            type="text"
                            placeholder="Add meg az ID-t"
                            value={values.password}
                            onChange={handleChange}
                            onBlur={handleBlur}
                            className={errors.password && touched.password ? "form-control is-invalid" : "form-control"}
                        />
                        {errors.password && touched.password && (
                            <div className={"invalid-feedback"}>{errors.password}</div>
                        )}
                    </div>
                    <button type="submit" disabled={isSubmitting} className={"btn btn-primary"}>
                        Check in
                    </button>
                </form>
            );
        }}
    </Formik>
);
export default AdminView;